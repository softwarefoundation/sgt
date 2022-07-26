package com.softwarefoundation.sgt;

import com.softwarefoundation.sgt.processadores.Assunto;
import com.softwarefoundation.sgt.processadores.Classes;
import com.softwarefoundation.sgt.processadores.Complemento;
import com.softwarefoundation.sgt.processadores.ComplementoMovimento;
import com.softwarefoundation.sgt.processadores.ComplementoTabelado;
import com.softwarefoundation.sgt.processadores.Itens;
import com.softwarefoundation.sgt.processadores.Movimento;
import com.softwarefoundation.sgt.processadores.ProcedimentoComplemento;
import com.softwarefoundation.sgt.processadores.TempItem;
import com.softwarefoundation.sgt.processadores.Temporariedade;
import com.softwarefoundation.sgt.processadores.TipoComplemento;
import com.softwarefoundation.sgt.processadores.TipoRamoJustica;

import java.io.IOException;

public class ProcessarArquivo {

    public static void main(String[] args) throws IOException {

        new Itens().processarArquivo();
        new Classes().processarArquivo();
        new Assunto().processarArquivo();
        new Movimento().processarArquivo();
        new TipoComplemento().processarArquivo();
        new Complemento().processarArquivo();
        new ComplementoMovimento().processarArquivo();
        new ComplementoTabelado().processarArquivo();
        new ProcedimentoComplemento().processarArquivo();
        new Temporariedade().processarArquivo();
        new TipoRamoJustica().processarArquivo();
        new TempItem().processarArquivo();

    }

}
