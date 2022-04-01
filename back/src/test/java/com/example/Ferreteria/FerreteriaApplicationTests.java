package com.example.Ferreteria;

import com.example.Ferreteria.model.ClienteModel;
import com.example.Ferreteria.model.VendedorModel;
import com.example.Ferreteria.services.ClienteService;
import com.example.Ferreteria.services.VendedorService;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class FerreteriaApplicationTests {
/*
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ClienteService clienteService;
	VendedorService vendedorService;



 */

	@Test
	void contextLoads() {
	}


/*
	@Test
	@DisplayName("Get/clientes success")
	void testGetClientesSuccess() throws Exception{

		/*ClienteModel clienteModel= new ClienteModel();
		clienteModel.setIdCliente("1234");
		clienteModel.setCedCliente("56789");
		clienteModel.setTelefonoCliente(4325734);
		clienteModel.setNombreCliente("Jane doe");

		ClienteModel clienteModel1= new ClienteModel();
		clienteModel1.setIdCliente("3456");
		clienteModel1.setCedCliente("345345");
		clienteModel1.setTelefonoCliente(122734);
		clienteModel1.setNombreCliente("Mary doe");

		doReturn(Lists.newArrayList(clienteModel,clienteModel1)).when(clienteService).listarTodos();

		mockMvc.perform(get("/listarClientes"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(header().string(HttpHeaders.LOCATION,"/listarClientes"))
				.andExpect(jsonPath("$", hasSize(2)))
				.andExpect((ResultMatcher) jsonPath("$[0].idCliente", is("1234")))
				.andExpect((ResultMatcher)jsonPath("[0].cedCliente",is("56789")))
				.andExpect((ResultMatcher) jsonPath("[0].telefonoCliente",is("4325734")))
				.andExpect((ResultMatcher) jsonPath("[0].nombreCliente", is("Jane Doe")))
				.andExpect((ResultMatcher) jsonPath("$[1].idCliente", is("3456")))
				.andExpect((ResultMatcher)jsonPath("[1].cedCliente",is("345345")))
				.andExpect((ResultMatcher) jsonPath("[1].telefonoCliente",is("122734")))
				.andExpect((ResultMatcher) jsonPath("[1].nombreCliente", is("Mary Doe")));

		 */

	}
/*
@Test
	@DisplayName("Get/vendedores success")
	void testGetVendedoresSuccess() throws Exception{
		VendedorModel vendendorModel= new VendedorModel();
		vendendorModel.setIdVendedor("1234");
		vendendorModel.setCedVendedor("56789");
		vendendorModel.setCelularVendedor(4325734);
		vendendorModel.setNombreVendedor("Diana doe");

		VendedorModel vendedorModel1 = new VendedorModel();
		vendendorModel.setIdVendedor("4567");
		vendendorModel.setCedVendedor("98765");
		vendendorModel.setCelularVendedor(192837);
		vendendorModel.setNombreVendedor("Maina doe");

		doReturn(Lists.newArrayList(vendendorModel,vendedorModel1)).when(vendedorService).listarVendedores();

		mockMvc.perform(get("/listarVendedores"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(header().string(HttpHeaders.LOCATION,"/listarVendedores"))
				.andExpect(jsonPath("$", hasSize(2)))
				.andExpect((ResultMatcher) jsonPath("$[0].idCliente", is("1234")))
				.andExpect((ResultMatcher)jsonPath("[0].cedCliente",is("56789")))
				.andExpect((ResultMatcher) jsonPath("[0].telefonoCliente",is("4325734")))
				.andExpect((ResultMatcher) jsonPath("[0].nombreCliente", is("Diana Doe")))
				.andExpect((ResultMatcher) jsonPath("$[1].idCliente", is("4567")))
				.andExpect((ResultMatcher)jsonPath("[1].cedCliente",is("98765")))
				.andExpect((ResultMatcher) jsonPath("[1].telefonoCliente",is("192837")))
				.andExpect((ResultMatcher) jsonPath("[1].nombreCliente", is("Maina Doe")));

	}



 */



