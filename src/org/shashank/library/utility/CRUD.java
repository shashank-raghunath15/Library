package org.shashank.library.utility;

import java.util.Collection;

import org.shashank.library.model.Model;

public interface CRUD {

	public Model save(Model model);

	public void update(Model model);

	public void delete(Model model);

	public Model get(Model model);

	public Collection<? extends Model> getAll(Class<? extends Model> model);
}
