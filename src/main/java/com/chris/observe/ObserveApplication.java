package com.chris.observe;

import com.chris.observe.comment.CommentInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class ObserveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserveApplication.class, args);
	}

	@Bean
	CommentInterface commentInterface() {
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(CommentInterface.class);
	}
}
