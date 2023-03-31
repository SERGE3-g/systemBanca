-- Active: 1679926215349@@localhost@3306@SystemBanca

CREATE TABLE Banca(
                      id_banca INT PRIMARY KEY NOT NULL,/* chiave primaria*/
                      nome_banca VARCHAR(50) NOT NULL,
                      indirizzo_banca VARCHAR(50) NOT NULL,
                      telefono_banca VARCHAR(50) NOT NULL

);


CREATE TABLE Cliente(
                        id_cliente INT PRIMARY KEY NOT NULL,/* chiave primaria*/
                        nome_cliente VARCHAR(50) NOT NULL,
                        cognome_cliente VARCHAR(50) NOT NULL,
                        indirizzo_cliente VARCHAR(50) NOT NULL,
                        telefono_cliente VARCHAR(50) NOT NULL,
                        email_cliente VARCHAR(50) NOT NULL
);


/* crea una tabella per ogni tipo di conto che si vuole gestire*/
CREATE TABLE Conto(
                      id_conto INT PRIMARY KEY NOT NULL, /*chiave primaria*/
                      numero_conto VARCHAR(50) NOT NULL,
                      saldo DOUBLE NOT NULL,
                      id_cliente INT NOT NULL,
                      id_banca INT NOT NULL,
                      FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),/* chiave esterna*/
                      FOREIGN KEY (id_banca) REFERENCES Banca(id_banca)/*chiave esterna*/
);


/* crea una tabella per ogni tipo di operazione che si vuole gestire*/
CREATE TABLE Operazione(
                           id_operazione INT PRIMARY KEY NOT NULL,// chiave primaria
                           data_operazione DATE NOT NULL,
                           tipo_operazione VARCHAR(50) NOT NULL,
                           importo DOUBLE NOT NULL,
                           id_conto INT NOT NULL,// chiave esterna
                           FOREIGN KEY (id_conto) REFERENCES Conto(id_conto)// chiave esterna
);

// crea una tabella per ogni tipo di dipendente che si vuole gestire (amministratore, gestore, dipendente)
CREATE TABLE Dipendente(
                           id_dipendente INT PRIMARY KEY NOT NULL,// chiave primaria
                           nome_dipendente VARCHAR(50) NOT NULL,
                           cognome_dipendente VARCHAR(50) NOT NULL,
                           indirizzo_dipendente VARCHAR(50) NOT NULL,
                           telefono_dipendente VARCHAR(50) NOT NULL,
                           email_dipendente VARCHAR(50) NOT NULL,
                           id_banca INT NOT NULL, // chiave esterna
                           FOREIGN KEY (id_banca) REFERENCES Banca(id_banca)// chiave esterna
);


// crea una tabella per ogni tipo di amministratore che si vuole gestire (amministratore, gestore, dipendente)
CREATE TABLE Amministratore(
                               id_amministratore INT PRIMARY KEY NOT NULL,// chiave primaria
                               nome_amministratore VARCHAR(50) NOT NULL,
                               cognome_amministratore VARCHAR(50) NOT NULL,
                               indirizzo_amministratore VARCHAR(50) NOT NULL,
                               telefono_amministratore VARCHAR(50) NOT NULL,
                               email_amministratore VARCHAR(50) NOT NULL,
                               id_banca INT NOT NULL,// chiave esterna
                               FOREIGN KEY (id_banca) REFERENCES Banca(id_banca)// chiave esterna
);

// crea una tabella per ogni tipo di gestore che si vuole gestire (amministratore, gestore, dipendente)
CREATE TABLE Gestore(
                        id_gestore INT PRIMARY KEY NOT NULL,// chiave primaria
                        nome_gestore VARCHAR(50) NOT NULL, // nome del gestore
                        cognome_gestore VARCHAR(50) NOT NULL,  // cognome del gestore
                        indirizzo_gestore VARCHAR(50) NOT NULL,
                        telefono_gestore VARCHAR(50) NOT NULL,
                        email_gestore VARCHAR(50) NOT NULL,
                        id_banca INT NOT NULL,// chiave esterna
                        FOREIGN KEY (id_banca) REFERENCES Banca(id_banca)// chiave esterna
);

