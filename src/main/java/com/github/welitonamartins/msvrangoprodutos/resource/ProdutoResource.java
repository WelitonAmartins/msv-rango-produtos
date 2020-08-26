package com.github.welitonamartins.msvrangoprodutos.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.uniliva.librangobase.dto.ProdutoDTO;
import com.github.uniliva.restutils.dto.DadosResponse;
import com.github.uniliva.restutils.resource.BaseResource;

@RestController
@RequestMapping("v1/produtos")
public class ProdutoResource implements BaseResource {

	@GetMapping
	public ResponseEntity<DadosResponse<List<ProdutoDTO>>> listarProdutos() {
		return retornarSucesso(Arrays.asList(new ProdutoDTO(), new ProdutoDTO(), new ProdutoDTO()));
	}

}
