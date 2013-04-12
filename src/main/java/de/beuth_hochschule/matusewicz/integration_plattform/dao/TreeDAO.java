package de.beuth_hochschule.matusewicz.integration_plattform.dao;

import java.util.*;

import de.beuth_hochschule.integration_plattform.model.*;

public interface TreeDAO {
	
	public List<Tree> getAll();
	public Tree getById(Long id);
	public void save(Tree tree);
	public void delete(Tree tree);

}
