package br.ufg.inf.fabrica.pac.controleAcesso.imp;

import br.ufg.inf.fabrica.pac.controleAcesso.IAutorizacao;
import java.util.Set;

/**
 *
 * @author Danillo
 */
public class AutorizacaoStub implements IAutorizacao{

    @Override
    public boolean verificaAutorizacao(Set<String> papeis, String recurso) {
        return true;
    }

    @Override
    public boolean verificaAutorizacao(Set<String> papeis, String recurso, String contexto) {
        return true;
    }
    
}
