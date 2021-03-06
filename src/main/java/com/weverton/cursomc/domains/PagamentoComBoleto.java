package com.weverton.cursomc.domains;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weverton.cursomc.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
	@JsonFormat(pattern="dd/MM/yyy hh:mm")
	private Date dataVencimento;
	@JsonFormat(pattern="dd/MM/yyy hh:mm")
	private Date dataPagamento;

	
	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(final Integer id,final  EstadoPagamento estado,final  Pedido pedido,final  Date dataVencimento,
			final Date dataPagamento) {

		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {

		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {

		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {

		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {

		this.dataPagamento = dataPagamento;
	}

}
