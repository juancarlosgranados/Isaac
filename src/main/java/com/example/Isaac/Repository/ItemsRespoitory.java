package com.example.Isaac.Repository;

import com.example.Isaac.model.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRespoitory extends CrudRepository<Items,Long> {
}
