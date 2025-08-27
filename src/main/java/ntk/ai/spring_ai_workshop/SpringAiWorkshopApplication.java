package ntk.ai.spring_ai_workshop;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class SpringAiWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiWorkshopApplication.class, args);
	}

	@Bean
	@Primary //to use default one
	@Qualifier("openAIChatClient") //to match with the controller where we want to use
	public ChatClient openAIChatClient(OpenAiChatModel chatModel){
		return ChatClient.create(chatModel);
	}
//
//	because I don't have API key
//	@Bean
//	@Qualifier("anthropicChatClient")
//	public ChatClient anthropicChatClient(AnthropicChatModel chatModel){
//		return ChatClient.create(chatModel);
//	}


}
