package com.xfastgames.lychat

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import io.reactivex.functions.Consumer

class ChatsController : Controller() {

  override fun onCreateView(inflater: LayoutInflater,
                            container: ViewGroup): View = inflater.inflate(R.layout.chats,
                                                                           container, false)

  override fun onAttach(view: View) {
    super.onAttach(view)
  }
}

class ChatsView(context: Context, attributes: AttributeSet)
  : ConstraintLayout(context, attributes), Consumer<ChatsUiModel> {

  override fun accept(model: ChatsUiModel) {
    when (model) {
      is ChatsUiModel.Loading -> {

      }
    }
  }

}

sealed class ChatUiEvent {
  object RequestChats : ChatUiEvent()
  data class NewChat(var chat: Chat) : ChatUiEvent()
  data class ViewChat(var chat: Chat)
  data class DeleteChat(var chat: Chat) : ChatUiEvent()
}

sealed class ChatsUiModel {
  object Loading : ChatsUiModel()
  data class Success(val chats: List<Chat>) : ChatsUiModel()
  data class Error(val message: String) : ChatsUiModel()

}


