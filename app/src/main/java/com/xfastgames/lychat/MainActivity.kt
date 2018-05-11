package com.xfastgames.lychat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction

class MainActivity : AppCompatActivity() {

  private lateinit var router: Router;

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val container: ViewGroup = findViewById(R.id.main_container)
    router = Conductor.attachRouter(this, container, savedInstanceState)

    // Start with the ChatView
    if (!router.hasRootController()) router.setRoot(RouterTransaction.with(ChatsController()))
  }
}
