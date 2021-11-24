package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Kindle 10a. geração");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51ij0YhqZTS._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Kindle-10a-gera%C3%A7%C"
				+ "3%A3o-ilumina%C3%A7%C3%A3o-embutida/dp/B07FQK1TS9?smid=A1ZZFT5FULY4LN&pf_rd_"
				+ "r=R3VB56DJTH9E15WM43YK&pf_rd_p=b0d8e0b5-6d86-4bff-b522-130401b3d323&pd_rd_r"
				+ "=73d1b0ae-a857-4fb6-bc49-d165b382e512&pd_rd_w=WZ5Yg&pd_rd_wg=rkG3k&ref_=pd_gw_unk");
		pedido.setDescricao("bateria de longa duração - Cor Preta");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
	
}
