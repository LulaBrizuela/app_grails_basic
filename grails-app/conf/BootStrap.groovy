import org.example.Book

import grails.util.GrailsUtil

class BootStrap {

    def init = { servletContext ->
    	switch (GrailsUtil.environment) {
		case "development":
			new Book(author: "Stephen King", title: "The Shining").save(failOnError: true)
			new Book(author: "James Patterson", title: "Along Came a Spider").save(failOnError: true)
			break
	}

    }
    def destroy = {
    }
}
