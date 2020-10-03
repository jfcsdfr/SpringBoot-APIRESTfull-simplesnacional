package com.example.apiSimplesNacional.partilhaImposto;

import org.springframework.stereotype.Service;

@Service
public class PartilhaImpostoAnexoII {
	
	private Double irpj_1faixa = 0.0550;
	private Double csll_1faixa = 0.0350;
	private Double cofins_1faixa = 0.1151;
	private Double pis_1faixa = 0.0249;
	private Double cpp_1faixa = 0.3750;
	private Double ipi_1faixa = 0.0750;
	private Double icms_1faixa = 0.32;
	
	private Double irpj_2faixa = 0.0550;
	private Double csll_2faixa = 0.0350;
	private Double cofins_2faixa = 0.1151;
	private Double pis_2faixa = 0.0249;
	private Double cpp_2faixa = 0.3750;
	private Double ipi_2faixa = 0.0750;
	private Double icms_2faixa = 0.32;
	
	private Double irpj_3faixa = 0.0550;
	private Double csll_3faixa = 0.0350;
	private Double cofins_3faixa = 0.1151;
	private Double pis_3faixa = 0.0249;
	private Double cpp_3faixa = 0.3750;
	private Double ipi_3faixa = 0.0750;
	private Double icms_3faixa = 0.32;
	
	private Double irpj_4faixa = 0.0550;
	private Double csll_4faixa = 0.0350;
	private Double cofins_4faixa = 0.1151;
	private Double pis_4faixa = 0.0249;
	private Double cpp_4faixa = 0.3750;
	private Double ipi_4faixa = 0.0750;
	private Double icms_4faixa = 0.32;
	
	private Double irpj_5faixa = 0.0550;
	private Double csll_5faixa = 0.0350;
	private Double cofins_5faixa = 0.1151;
	private Double pis_5faixa = 0.0249;
	private Double cpp_5faixa = 0.3750;
	private Double ipi_5faixa = 0.0750;
	private Double icms_5faixa = 0.32;
	
	private Double irpj_6faixa = 0.0850;
	private Double csll_6faixa = 0.0750;
	private Double cofins_6faixa = 0.2096;
	private Double pis_6faixa = 0.0454;
	private Double cpp_6faixa = 0.2350;
	private Double ipi_6faixa = 0.3500;
	private Double icms_6faixa = 0.00;
	
	public PartilhaImpostoAnexoII() {
	}

	public PartilhaImpostoAnexoII(Double irpj_1faixa, Double csll_1faixa, Double cofins_1faixa, Double pis_1faixa,
			Double cpp_1faixa, Double ipi_1faixa, Double icms_1faixa, Double irpj_2faixa, Double csll_2faixa,
			Double cofins_2faixa, Double pis_2faixa, Double cpp_2faixa, Double ipi_2faixa, Double icms_2faixa,
			Double irpj_3faixa, Double csll_3faixa, Double cofins_3faixa, Double pis_3faixa, Double cpp_3faixa,
			Double ipi_3faixa, Double icms_3faixa, Double irpj_4faixa, Double csll_4faixa, Double cofins_4faixa,
			Double pis_4faixa, Double cpp_4faixa, Double ipi_4faixa, Double icms_4faixa, Double irpj_5faixa,
			Double csll_5faixa, Double cofins_5faixa, Double pis_5faixa, Double cpp_5faixa, Double ipi_5faixa,
			Double icms_5faixa, Double irpj_6faixa, Double csll_6faixa, Double cofins_6faixa, Double pis_6faixa,
			Double cpp_6faixa, Double ipi_6faixa, Double icms_6faixa) {
		super();
		this.irpj_1faixa = irpj_1faixa;
		this.csll_1faixa = csll_1faixa;
		this.cofins_1faixa = cofins_1faixa;
		this.pis_1faixa = pis_1faixa;
		this.cpp_1faixa = cpp_1faixa;
		this.ipi_1faixa = ipi_1faixa;
		this.icms_1faixa = icms_1faixa;
		this.irpj_2faixa = irpj_2faixa;
		this.csll_2faixa = csll_2faixa;
		this.cofins_2faixa = cofins_2faixa;
		this.pis_2faixa = pis_2faixa;
		this.cpp_2faixa = cpp_2faixa;
		this.ipi_2faixa = ipi_2faixa;
		this.icms_2faixa = icms_2faixa;
		this.irpj_3faixa = irpj_3faixa;
		this.csll_3faixa = csll_3faixa;
		this.cofins_3faixa = cofins_3faixa;
		this.pis_3faixa = pis_3faixa;
		this.cpp_3faixa = cpp_3faixa;
		this.ipi_3faixa = ipi_3faixa;
		this.icms_3faixa = icms_3faixa;
		this.irpj_4faixa = irpj_4faixa;
		this.csll_4faixa = csll_4faixa;
		this.cofins_4faixa = cofins_4faixa;
		this.pis_4faixa = pis_4faixa;
		this.cpp_4faixa = cpp_4faixa;
		this.ipi_4faixa = ipi_4faixa;
		this.icms_4faixa = icms_4faixa;
		this.irpj_5faixa = irpj_5faixa;
		this.csll_5faixa = csll_5faixa;
		this.cofins_5faixa = cofins_5faixa;
		this.pis_5faixa = pis_5faixa;
		this.cpp_5faixa = cpp_5faixa;
		this.ipi_5faixa = ipi_5faixa;
		this.icms_5faixa = icms_5faixa;
		this.irpj_6faixa = irpj_6faixa;
		this.csll_6faixa = csll_6faixa;
		this.cofins_6faixa = cofins_6faixa;
		this.pis_6faixa = pis_6faixa;
		this.cpp_6faixa = cpp_6faixa;
		this.ipi_6faixa = ipi_6faixa;
		this.icms_6faixa = icms_6faixa;
	}

	public Double getIrpj_1faixa() {
		return irpj_1faixa;
	}

	public void setIrpj_1faixa(Double irpj_1faixa) {
		this.irpj_1faixa = irpj_1faixa;
	}

	public Double getCsll_1faixa() {
		return csll_1faixa;
	}

	public void setCsll_1faixa(Double csll_1faixa) {
		this.csll_1faixa = csll_1faixa;
	}

	public Double getCofins_1faixa() {
		return cofins_1faixa;
	}

	public void setCofins_1faixa(Double cofins_1faixa) {
		this.cofins_1faixa = cofins_1faixa;
	}

	public Double getPis_1faixa() {
		return pis_1faixa;
	}

	public void setPis_1faixa(Double pis_1faixa) {
		this.pis_1faixa = pis_1faixa;
	}

	public Double getCpp_1faixa() {
		return cpp_1faixa;
	}

	public void setCpp_1faixa(Double cpp_1faixa) {
		this.cpp_1faixa = cpp_1faixa;
	}

	public Double getIpi_1faixa() {
		return ipi_1faixa;
	}

	public void setIpi_1faixa(Double ipi_1faixa) {
		this.ipi_1faixa = ipi_1faixa;
	}

	public Double getIcms_1faixa() {
		return icms_1faixa;
	}

	public void setIcms_1faixa(Double icms_1faixa) {
		this.icms_1faixa = icms_1faixa;
	}

	public Double getIrpj_2faixa() {
		return irpj_2faixa;
	}

	public void setIrpj_2faixa(Double irpj_2faixa) {
		this.irpj_2faixa = irpj_2faixa;
	}

	public Double getCsll_2faixa() {
		return csll_2faixa;
	}

	public void setCsll_2faixa(Double csll_2faixa) {
		this.csll_2faixa = csll_2faixa;
	}

	public Double getCofins_2faixa() {
		return cofins_2faixa;
	}

	public void setCofins_2faixa(Double cofins_2faixa) {
		this.cofins_2faixa = cofins_2faixa;
	}

	public Double getPis_2faixa() {
		return pis_2faixa;
	}

	public void setPis_2faixa(Double pis_2faixa) {
		this.pis_2faixa = pis_2faixa;
	}

	public Double getCpp_2faixa() {
		return cpp_2faixa;
	}

	public void setCpp_2faixa(Double cpp_2faixa) {
		this.cpp_2faixa = cpp_2faixa;
	}

	public Double getIpi_2faixa() {
		return ipi_2faixa;
	}

	public void setIpi_2faixa(Double ipi_2faixa) {
		this.ipi_2faixa = ipi_2faixa;
	}

	public Double getIcms_2faixa() {
		return icms_2faixa;
	}

	public void setIcms_2faixa(Double icms_2faixa) {
		this.icms_2faixa = icms_2faixa;
	}

	public Double getIrpj_3faixa() {
		return irpj_3faixa;
	}

	public void setIrpj_3faixa(Double irpj_3faixa) {
		this.irpj_3faixa = irpj_3faixa;
	}

	public Double getCsll_3faixa() {
		return csll_3faixa;
	}

	public void setCsll_3faixa(Double csll_3faixa) {
		this.csll_3faixa = csll_3faixa;
	}

	public Double getCofins_3faixa() {
		return cofins_3faixa;
	}

	public void setCofins_3faixa(Double cofins_3faixa) {
		this.cofins_3faixa = cofins_3faixa;
	}

	public Double getPis_3faixa() {
		return pis_3faixa;
	}

	public void setPis_3faixa(Double pis_3faixa) {
		this.pis_3faixa = pis_3faixa;
	}

	public Double getCpp_3faixa() {
		return cpp_3faixa;
	}

	public void setCpp_3faixa(Double cpp_3faixa) {
		this.cpp_3faixa = cpp_3faixa;
	}

	public Double getIpi_3faixa() {
		return ipi_3faixa;
	}

	public void setIpi_3faixa(Double ipi_3faixa) {
		this.ipi_3faixa = ipi_3faixa;
	}

	public Double getIcms_3faixa() {
		return icms_3faixa;
	}

	public void setIcms_3faixa(Double icms_3faixa) {
		this.icms_3faixa = icms_3faixa;
	}

	public Double getIrpj_4faixa() {
		return irpj_4faixa;
	}

	public void setIrpj_4faixa(Double irpj_4faixa) {
		this.irpj_4faixa = irpj_4faixa;
	}

	public Double getCsll_4faixa() {
		return csll_4faixa;
	}

	public void setCsll_4faixa(Double csll_4faixa) {
		this.csll_4faixa = csll_4faixa;
	}

	public Double getCofins_4faixa() {
		return cofins_4faixa;
	}

	public void setCofins_4faixa(Double cofins_4faixa) {
		this.cofins_4faixa = cofins_4faixa;
	}

	public Double getPis_4faixa() {
		return pis_4faixa;
	}

	public void setPis_4faixa(Double pis_4faixa) {
		this.pis_4faixa = pis_4faixa;
	}

	public Double getCpp_4faixa() {
		return cpp_4faixa;
	}

	public void setCpp_4faixa(Double cpp_4faixa) {
		this.cpp_4faixa = cpp_4faixa;
	}

	public Double getIpi_4faixa() {
		return ipi_4faixa;
	}

	public void setIpi_4faixa(Double ipi_4faixa) {
		this.ipi_4faixa = ipi_4faixa;
	}

	public Double getIcms_4faixa() {
		return icms_4faixa;
	}

	public void setIcms_4faixa(Double icms_4faixa) {
		this.icms_4faixa = icms_4faixa;
	}

	public Double getIrpj_5faixa() {
		return irpj_5faixa;
	}

	public void setIrpj_5faixa(Double irpj_5faixa) {
		this.irpj_5faixa = irpj_5faixa;
	}

	public Double getCsll_5faixa() {
		return csll_5faixa;
	}

	public void setCsll_5faixa(Double csll_5faixa) {
		this.csll_5faixa = csll_5faixa;
	}

	public Double getCofins_5faixa() {
		return cofins_5faixa;
	}

	public void setCofins_5faixa(Double cofins_5faixa) {
		this.cofins_5faixa = cofins_5faixa;
	}

	public Double getPis_5faixa() {
		return pis_5faixa;
	}

	public void setPis_5faixa(Double pis_5faixa) {
		this.pis_5faixa = pis_5faixa;
	}

	public Double getCpp_5faixa() {
		return cpp_5faixa;
	}

	public void setCpp_5faixa(Double cpp_5faixa) {
		this.cpp_5faixa = cpp_5faixa;
	}

	public Double getIpi_5faixa() {
		return ipi_5faixa;
	}

	public void setIpi_5faixa(Double ipi_5faixa) {
		this.ipi_5faixa = ipi_5faixa;
	}

	public Double getIcms_5faixa() {
		return icms_5faixa;
	}

	public void setIcms_5faixa(Double icms_5faixa) {
		this.icms_5faixa = icms_5faixa;
	}

	public Double getIrpj_6faixa() {
		return irpj_6faixa;
	}

	public void setIrpj_6faixa(Double irpj_6faixa) {
		this.irpj_6faixa = irpj_6faixa;
	}

	public Double getCsll_6faixa() {
		return csll_6faixa;
	}

	public void setCsll_6faixa(Double csll_6faixa) {
		this.csll_6faixa = csll_6faixa;
	}

	public Double getCofins_6faixa() {
		return cofins_6faixa;
	}

	public void setCofins_6faixa(Double cofins_6faixa) {
		this.cofins_6faixa = cofins_6faixa;
	}

	public Double getPis_6faixa() {
		return pis_6faixa;
	}

	public void setPis_6faixa(Double pis_6faixa) {
		this.pis_6faixa = pis_6faixa;
	}

	public Double getCpp_6faixa() {
		return cpp_6faixa;
	}

	public void setCpp_6faixa(Double cpp_6faixa) {
		this.cpp_6faixa = cpp_6faixa;
	}

	public Double getIpi_6faixa() {
		return ipi_6faixa;
	}

	public void setIpi_6faixa(Double ipi_6faixa) {
		this.ipi_6faixa = ipi_6faixa;
	}

	public Double getIcms_6faixa() {
		return icms_6faixa;
	}

	public void setIcms_6faixa(Double icms_6faixa) {
		this.icms_6faixa = icms_6faixa;
	}
}
