package br.com.knowledge.sgi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.knowledge.sgi.model.tabela.SituacaoImovel;
import br.com.knowledge.sgi.repository.SituacaoImovelRepository;

@Controller
//@RequestMapping("/situacao_imovel")
public class SituacaoImovelController {
	@Autowired
	private SituacaoImovelRepository situacaoImovelRepository;
	@GetMapping("/situacao_imovel")
	public ModelAndView listar() {
		List<SituacaoImovel> situacoesImovel = situacaoImovelRepository.findAll();
		ModelAndView mv = new ModelAndView("tabela/situacao_imovel");
		mv.addObject("situacoes", situacoesImovel);
		return mv;
	}

	/*
	@GetMapping("/situacao_imovel_cadastro")
	public String cadastro() {
		return "/tabela/situacao_imovel_cadastro";
	}
	*/
	@GetMapping("/{situacaoImovelId}")
	public ModelAndView atualizacao(@PathVariable("situacaoImovelId") Integer situacaoImovelId) {
		SituacaoImovel situacaoImovel = situacaoImovelRepository.findBySituacaoImovelId(situacaoImovelId);
		ModelAndView mv = new ModelAndView("/tabela/situacao_imovel_cadastro");
		mv.addObject("situacaoImovel", situacaoImovel);
		return mv;
	}
	@PostMapping("/situacao_imovel_cadastro")
	public String cadastro(SituacaoImovel situacaoImovel) {
		situacaoImovelRepository.save(situacaoImovel);
		return "redirect:/situacao_imovel";
	}
}
