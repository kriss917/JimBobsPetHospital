package com.example.jimbobspethospital;

import org.flywaydb.core.Flyway;

public class ResetAvMigrationHistory {

        public static void main(String[] args) {
            Flyway flyway = Flyway.configure()
                    .dataSource("jdbc:postgresql://localhost:5432/pets", "root", "password")
                    .load();

            // Perform repair
            flyway.repair();
        }
    }
