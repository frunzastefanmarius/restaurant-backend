package presonalproject.restaurantbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import presonalproject.restaurantbackend.Model.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
