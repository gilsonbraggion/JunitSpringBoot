package br.com.rhinosistemas;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class WebTest {

	@Autowired
    private MockMvc mvc;
	
	@Test
	void test() throws Exception {
		this.mvc.perform(get("/api/employees"));
		
	}

	@Test
	void salvarEmployee() throws Exception {
		
		this.mvc.perform(post("/api/salvar").param("id", "10").param("name", "Gilson"));
		
	}
	
}
