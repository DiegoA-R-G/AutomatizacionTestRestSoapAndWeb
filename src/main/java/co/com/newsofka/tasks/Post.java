    package co.com.newsofka.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

    public class Post implements Task {
        private String resource;
        private String body;

        public Post withTheResource(String resource) {
            this.resource = resource;
            return this;
        }

        public Post withTheBody(String body) {
            this.body = body;
            return this;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    net.serenitybdd.screenplay.rest.interactions.Post.to(resource)
                            .with(requestSpecification -> requestSpecification
                                    .relaxedHTTPSValidation()
                                    .contentType(ContentType.JSON)
                                    .body(body))
            );
        }

        public static Post sendRegistrationData() {
            return new Post();
        }
    }
