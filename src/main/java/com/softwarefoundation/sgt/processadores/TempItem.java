package com.softwarefoundation.sgt.processadores;

import com.softwarefoundation.sgt.Constantes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TempItem extends AbstractProcessamento {

    @Override
    protected Path pathArquivo() {
        return Paths.get(Constantes.Arquivo.INSERT_TEMP_ITEM);
    }

    @Override
    protected String inicioSqlInsert() {
        return Constantes.SQL.INSERT_INTO_TEMP_ITEM_VALUES;
    }

    @Override
    protected String fimSqlInsert() {
        return "END;";
    }
}
