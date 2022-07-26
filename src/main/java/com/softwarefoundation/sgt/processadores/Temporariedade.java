package com.softwarefoundation.sgt.processadores;

import com.softwarefoundation.sgt.Constantes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Temporariedade extends AbstractProcessamento {

    @Override
    protected Path pathArquivo() {
        return Paths.get(Constantes.Arquivo.INSERT_TEMPORARIEDADE);
    }

    @Override
    protected String inicioSqlInsert() {
        return Constantes.SQL.INSERT_INTO_TEMPORARIEDADE_VALUES;
    }

    @Override
    protected String fimSqlInsert() {
        return Constantes.SQL.INSERT_INTO_TIPO_RAMO_JUSTICA_VALUES;
    }
}
