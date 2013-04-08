package in.jgabriellima.agendajs.repository;
/**
 * @author  J. Gabriel Lima 
 * @email   jgabriel.ufpa@gmail.com
 * @site    http://www.jgabriellima.in
 */

import in.jgabriellima.agendajs.model.Agenda;
import java.util.List;

public interface AgendaRepository {

    public void save(Agenda agenda);

    public void update(Agenda agenda);

    public void delete(Agenda agenda);

    public List<Agenda> list();
}
