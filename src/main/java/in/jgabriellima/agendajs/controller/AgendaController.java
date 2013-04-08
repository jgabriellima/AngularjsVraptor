package in.jgabriellima.agendajs.controller;
/**
 * @author  J. Gabriel Lima 
 * @email   jgabriel.ufpa@gmail.com
 * @site    http://www.jgabriellima.in
 */
import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import in.jgabriellima.agendajs.model.Agenda;
import in.jgabriellima.agendajs.repository.AgendaRepository;

@Resource
public class AgendaController {

    private Result result;
    private AgendaRepository dao;

    public AgendaController(Result result, AgendaRepository dao) {
        this.result = result;
        this.dao = dao;
    }

    @Post("/agendas")
    @Consumes("application/json")
    public void save(Agenda agenda) {
        dao.save(agenda);
        this.result.use(Results.json()).withoutRoot().from(agenda).serialize();
    }

    @Put("/agendas/{agenda.id}")
    @Consumes("application/json")
    public void update(Agenda agenda) {
        dao.update(agenda);
        result.nothing();
    }

    @Delete("/agendas/{agenda.id}")
    public void delete(Agenda agenda) {
        dao.delete(agenda);
        result.nothing();
    }

    @Get("/agendas")
    public void list() {
        result.use(Results.json()).withoutRoot().from(dao.list()).serialize();
    }
}
