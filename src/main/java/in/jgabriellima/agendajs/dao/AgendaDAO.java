package in.jgabriellima.agendajs.dao;
/**
 * @author  J. Gabriel Lima 
 * @email   jgabriel.ufpa@gmail.com
 * @site    http://www.jgabriellima.in
 */
import br.com.caelum.vraptor.ioc.Component;
import in.jgabriellima.agendajs.model.Agenda;
import in.jgabriellima.agendajs.repository.AgendaRepository;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("agenda")
public class AgendaDAO implements AgendaRepository {

    private final Session session;

    public AgendaDAO(Session session) {
        this.session = session;
    }

    @Override
    public void save(Agenda agenda) {
        session.save(agenda);
    }

    @Override
    public void update(Agenda agenda) {
        session.update(agenda);
    }

    @Override
    public void delete(Agenda agenda) {
        session.delete(agenda);
    }

    @Override
    public List<Agenda> list() {
        return session.createCriteria(Agenda.class).list();
    }
}
