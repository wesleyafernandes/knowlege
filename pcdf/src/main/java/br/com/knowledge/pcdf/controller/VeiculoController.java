package br.com.knowledge.pcdf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.knowledge.pcdf.model.Veiculo;
import br.com.knowledge.pcdf.repository.VeiculoRepository;

@Controller
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoRepository vr;
	
	@RequestMapping(method=RequestMethod.GET)
	public String cadastro(Model model) {
		Veiculo veiculo = new Veiculo();
		model.addAttribute("veiculo", veiculo);
		return "/veiculo/veiculo_cadastro";
	}
	
	@RequestMapping(value="/lista",method=RequestMethod.GET)
	public String lista(Model model,@RequestParam(value="search",required=false) String search) {
		Sort sort = new Sort(Sort.Direction.ASC,new String[] {"secao","marcaModelo","anoModelo"});
		List<Veiculo> veiculos = vr.findAll(sort);
		model.addAttribute("veiculos", veiculos);
		return "/veiculo/veiculo_lista";
	}

	@RequestMapping(value="/{veiculoId}",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView cadastrado(@PathVariable Integer veiculoId) {
		Veiculo veiculo = vr.findById(veiculoId).get();
		ModelAndView mv = new ModelAndView("/veiculo/veiculo_cadastro");
		mv.addObject("veiculo", veiculo);
		return mv;
	}

	@PostMapping
	public ModelAndView cadastrar(Veiculo veiculo) {
		vr.save(veiculo);
		ModelAndView mv = new ModelAndView("/veiculo/veiculo_cadastro");
		mv.addObject("veiculo", veiculo);
		return mv;
	}
}
