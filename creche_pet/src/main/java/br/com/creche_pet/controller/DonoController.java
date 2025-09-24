package br.com.creche_pet.controller;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.creche_pet.model.DonoModel;
import br.com.creche_pet.repository.DonoRepository;
import ch.qos.logback.core.model.Model;

@Controller
public class DonoController {

	@Autowired
	DonoRepository donoRepository;

	@GetMapping(value = "/")
	public String dono(ModelMap model) {

		model.addAttribute("dono", donoRepository.findAll());

		return "dono";

	}

	@GetMapping(value = "/dono")
	public String dono2(ModelMap model) {

		model.addAttribute("dono", donoRepository.findAll());

		return "dono";

	}

	@GetMapping(value = "/editar/{id}")
	public String editarDono(@PathVariable("id") Long id, ModelMap model) {
		System.out.println("DATTEBAYO");
		Optional<DonoModel> dono = donoRepository.findById(id); // dono minusculo é o nome da
									// variavel na linha 18
		if (dono == null) {
			// trate o erro se o id não existir
			return "redirect:/dono?erro=nao-encontrado";

		}
		model.addAttribute("dono"/* NO HTML */, dono/* NO JAVA */);
		return "editar-dono"; // nome do template HTML para edição
	}

	@PostMapping(value = "/salvar")
	public String salvarDono(@ModelAttribute DonoModel dono, Model model) {

		dono.setData(new Timestamp(System.currentTimeMillis()));
		// aqui voce pode fazer validações, se quiser
		donoRepository.save(dono); // salva ou atualiza no banco

		// redireciona para a lista com uma mensagem de sucesso(opcional)
		return "redirect:/dono";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id,
			RedirectAttributes redirectAttributes) {
		try {
			donoRepository.deleteById(id);
			redirectAttributes.addFlashAttribute("Mensagem", "Idioma excluído com sucesso!");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("Erro", "Erro ao excluir o idioma.");
		}
		return "redirect:/dono"; // redireciona para a pagina de listagem principal
	}

	@GetMapping("/novo")
	public String exibirFormularioInclusao(ModelMap model) {
		model.addAttribute("dono", new DonoModel());
		return "incluir_dono";
	}

}
