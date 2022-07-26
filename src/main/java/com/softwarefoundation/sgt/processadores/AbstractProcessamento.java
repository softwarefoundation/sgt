package com.softwarefoundation.sgt.processadores;

import com.softwarefoundation.sgt.Constantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public abstract class AbstractProcessamento {


    public void processarArquivo() throws IOException {

        System.out.println("INICIO: ".concat(inicioSqlInsert()));

        File file = new File(Constantes.Arquivo.DUMP);

        Boolean isLinhaInsertClasses = false;
        prepararAquivosSQL();

        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
            String linha;
            while ((linha = br.readLine()) != null) {

                if (linha.startsWith(inicioSqlInsert())) {
                    isLinhaInsertClasses = true;
                }

                if (isLinhaInsertClasses) {
                    if (linha.startsWith(fimSqlInsert())) {
                        break;
                    }
                    gravarTextoNoArquivo(linha);
                }
            }
        }
        System.out.println("FIM: ".concat(inicioSqlInsert()));

    }

    private void gravarTextoNoArquivo(String texto) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(pathArquivo(), StandardOpenOption.APPEND)) {
            writer.write(texto);
            writer.write(System.lineSeparator());
        }
    }

    private void prepararAquivosSQL() throws IOException {
        Files.deleteIfExists(pathArquivo());
        Files.createFile(pathArquivo());
    }

    protected abstract Path pathArquivo();

    protected abstract String inicioSqlInsert();

    protected abstract String fimSqlInsert();


}
