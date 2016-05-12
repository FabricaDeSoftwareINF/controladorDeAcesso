package br.ufg.inf.fabrica.pac.controleAcesso;

import java.util.Set;

/**
 *
 * @author murilo
 */
public interface IAutorizacao {
    public boolean verificaAutorizacao(Set<String> papeis, String recurso);
    public boolean verificaAutorizacao(Set<String> papeis, String recurso, String contexto);
}
