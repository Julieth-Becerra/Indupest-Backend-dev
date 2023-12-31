package com.example.listore.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ListoreUser extends GeneralModel  {

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 60)
    private String address;

    @Column(nullable = false, length = 1)
    private String role;

    @OneToOne
    @JoinColumn(name = "credential_id")
    private Credential credential;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", credential=" + credential +
                '}';
    }
}
