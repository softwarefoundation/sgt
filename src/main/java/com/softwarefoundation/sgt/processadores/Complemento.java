package com.softwarefoundation.sgt.processadores;

import com.softwarefoundation.sgt.Constantes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Complemento extends AbstractProcessamento {

    @Override
    protected Path pathArquivo() {
        return Paths.get(Constantes.Arquivo.INSERT_COMPLEMENTO);
    }

    @Override
    protected String inicioSqlInsert() {
        return Constantes.SQL.INSERT_INTO_COMPLEMENTO_VALUES;
    }

    @Override
    protected String fimSqlInsert() {
        return Constantes.SQL.INSERT_INTO_COMPLEMENTO_MOVIMENTO_VALUES;
    }
}
