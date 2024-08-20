package presonalproject.restaurantbackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import presonalproject.restaurantbackend.Model.Category;
import presonalproject.restaurantbackend.Repository.CategoryRepo;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo myCategoryRepo;

    public List<Category> getAllCategory(){
       return myCategoryRepo.findAll();
    }

    public Category findById(Integer id){
        return myCategoryRepo.findById(id).orElseThrow(()->new RuntimeException("Category not found in DB"));
    }

    public Category createCategory(Category myCategory){
        return myCategoryRepo.save(myCategory);
    }

    public Category updateCategory(Integer id, Category categoryUpdated){

        Category myCategory = myCategoryRepo.findById(id).orElseThrow(()->new RuntimeException("Category not found in DB"));
        myCategory.setName(categoryUpdated.getName());
        myCategory.setDescription(categoryUpdated.getDescription());

        return  myCategoryRepo.save(myCategory);
    }
    public Category deleteCategory(Integer id){
        myCategoryRepo.deleteById(id);
        return null;
    }
}
