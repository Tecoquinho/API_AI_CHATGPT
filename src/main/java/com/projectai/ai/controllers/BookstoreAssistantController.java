package com.projectai.ai.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ai.openai.OpenAiChatModel;

@RestController
@RequestMapping("/bookstore")
public class BookstoreAssistantController {
    private OpenAiChatModel chatModel;

    public BookstoreAssistantController(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/informations")
    public String bookstoreChat(@RequestParam(value = "message", defaultValue = "Quais são os livros best sellers dos ultimos anos?") String message){
        return chatModel.call(message);
    }
}
