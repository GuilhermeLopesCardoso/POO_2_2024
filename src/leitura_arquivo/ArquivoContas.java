package leitura_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import atividadebanco.ContaBancaria;
import atividadebanco.ContaBancariaCorrente;
import atividadebanco.ContaBancariaEspecial;
import atividadebanco.ContaBancariaPoupanca;

public class ArquivoContas {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        try {
            FileReader fr = new FileReader("POO2/contas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine())!=null) {
                //System.out.println(linha);
                String v[] = linha.split(",");
                int nr = Integer.parseInt(v[1]);
                double saldo = Double.parseDouble(v[2]);
                if(v[0].equals ("0")) {
                   contas.add(new ContaBancariaCorrente(55,100));
                }

                if(v[0].equals ("1")) {
                    contas.add(new ContaBancariaPoupanca(70,100));
                 }

                 if(v[0].equals ("2")) {
                    contas.add(new ContaBancariaEspecial(88,100,500));
                 }
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
