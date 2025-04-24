package com.example.dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voiture")
public class Voiture {

        @Id
        private String idVoiture;
        private String marque;
        private String modele;
        private String image;
        private int annee;

        public Voiture() {
        }

        public Voiture(String marque, String modele, String image, int annee) {
                this.marque = marque;
                this.modele = modele;
                this.image = image;
                this.annee = annee;
        }

        public String getIdVoiture() {
                return idVoiture;
        }

        public void setIdVoiture(String idVoiture) {
                this.idVoiture = idVoiture;
        }

        public String getMarque() {
                return marque;
        }

        public void setMarque(String marque) {
                this.marque = marque;
        }

        public String getModele() {
                return modele;
        }

        public void setModele(String modele) {
                this.modele = modele;
        }

        public String getImage() {
                return image;
        }

        public void setImage(String image) {
                this.image = image;
        }

        public int getAnnee() {
                return annee;
        }

        public void setAnnee(int annee) {
                this.annee = annee;
        }

        @Override
        public String toString() {
                return "Voiture{" +
                        "idVoiture='" + idVoiture + '\'' +
                        ", marque='" + marque + '\'' +
                        ", modele='" + modele + '\'' +
                        ", image='" + image + '\'' +
                        ", annee=" + annee +
                        '}';
        }
}
