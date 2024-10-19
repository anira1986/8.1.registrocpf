/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.registrocpf.model;

public class LocalRegistro {

    public LocalRegistro() {
        super(); // Chama o construtor da classe Object
    }

    // Método para obter o local de registro com base no CPF
    public String getLocalRegistro(String cpf) {
        // Extrair o nono dígito do CPF
        char nonoDigito = cpf.charAt(8);
        String local;

        switch (nonoDigito) {
            case '1':
                local = "Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins";
                break;
            case '2':
                local = "Pará, Amazonas, Acre, Amapá, Rondônia e Roraima";
                break;
            case '3':
                local = "Ceará, Maranhão e Piauí";
                break;
            case '4':
                local = "Pernambuco, Rio Grande do Norte, Paraíba e Alagoas";
                break;
            case '5':
                local = "Bahia e Sergipe";
                break;
            case '6':
                local = "Minas Gerais";
                break;
            case '7':
                local = "Rio de Janeiro e Espírito Santo";
                break;
            case '8':
                local = "São Paulo";
                break;
            case '9':
                local = "Paraná e Santa Catarina";
                break;
            case '0':
                local = "Rio Grande do Sul";
                break;
            default:
                local = "Local de registro desconhecido";
                break;
        }
        return local;
    }
}
