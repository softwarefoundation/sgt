package com.softwarefoundation.sgt.processadores;

import com.softwarefoundation.sgt.Constantes;
import com.softwarefoundation.sgt.processadores.AbstractProcessamento;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Assunto extends AbstractProcessamento {

    @Override
    protected Path pathArquivo() {
        return Paths.get(Constantes.Arquivo.INSERT_ASSUNTO_SQL);
    }

    @Override
    protected String inicioSqlInsert() {
        return Constantes.SQL.INSERT_INTO_ASSUNTOS_VALUES;
    }

    @Override
    protected String fimSqlInsert() {
        return Constantes.SQL.INSERT_INTO_MOVIMENTOS_VALUES;
    }
}
