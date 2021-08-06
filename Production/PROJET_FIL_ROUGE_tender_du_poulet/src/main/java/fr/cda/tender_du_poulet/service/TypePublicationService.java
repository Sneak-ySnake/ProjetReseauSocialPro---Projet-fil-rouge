package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.TypePublicationRepository;
import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.iService.TypePublicationInterfaceService;
import fr.cda.tender_du_poulet.util.TypePublicationConverter;

@Service
public class TypePublicationService implements TypePublicationInterfaceService{

	private TypePublicationConverter converter = new TypePublicationConverter();

	@Autowired
	private TypePublicationRepository typePublicationRepository;

	public void addTypePublication(TypePublicationDTO t) {
		typePublicationRepository.save(converter.dtoVersEntity(t));
	}
	
	public TypePublicationDTO findTypePublication(int id) {
		return converter.entityVersDto(typePublicationRepository.findById(id).get());
	}
	
	public List<TypePublicationDTO> findAllTypePublication() {
		return converter.entityVersDto(typePublicationRepository.findAll());
	}
	
	public void deleteTypePublication(int id) {
		typePublicationRepository.deleteById(id);
	}
	
	public void updateTypePublication(TypePublicationDTO t) {
		typePublicationRepository.save(converter.dtoVersEntity(t));
	}
	
	/*public void modifTypePublication(int id, String modif) {
		TypePublication t = typePublicationRepository.findById(id).get();
		t.setNom_type_publication(modif);
		typePublicationRepository.save(t);
	}*/
	
}
