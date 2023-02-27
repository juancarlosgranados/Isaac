package com.example.Isaac.Repository;

import com.example.Isaac.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface FileRepository extends JpaRepository<File, UUID>{

}
