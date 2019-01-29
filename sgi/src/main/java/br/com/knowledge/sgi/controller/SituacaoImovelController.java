package br.com.knowledge.sgi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.knowledge.sgi.model.tabela.SituacaoImovel;
import br.com.knowledge.sgi.repository.SituacaoImovelRepository;

@RestController
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
}
