package br.com.project.apidistribuidora.model;

import br.com.project.apidistribuidora.dto.ClientDto;
import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;
    private String razao;
    private String fantasia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Adress adress;
    @Column(name = "telefone")
    private String telephone;
    private String email;

    public Client() {
    }

    public Client(ClientDto clientDto) {
        this.cnpj = clientDto.cnpj();
        this.razao = clientDto.razao();
        this.fantasia = clientDto.fantasia();
        this.adress = new Adress(clientDto.adress());
        this.telephone = clientDto.telephone();
        this.email = clientDto.email();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void atualizarCadastro(ClientDto dadosAtualizados) {
       if (dadosAtualizados.cnpj() != null){
           this.cnpj = dadosAtualizados.cnpj();
       }else if (dadosAtualizados.razao() != null){
            this.razao = dadosAtualizados.razao();
        }else if (dadosAtualizados.fantasia() != null){
            this.fantasia = dadosAtualizados.fantasia();
        }else if (dadosAtualizados.adress() != null){
            this.adress = new Adress(dadosAtualizados.adress());
        }else if (dadosAtualizados.telephone() != null) {
           this.telephone = dadosAtualizados.telephone();
       }else if (dadosAtualizados.email() != null) {
           this.email = dadosAtualizados.email();
       }
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", razao='" + razao + '\'' +
                ", fantasia='" + fantasia + '\'' +
                ", adress=" + adress +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
