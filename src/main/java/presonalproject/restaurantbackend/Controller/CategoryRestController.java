package presonalproject.restaurantbackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import presonalproject.restaurantbackend.Model.Category;
import presonalproject.restaurantbackend.Service.CategoryService;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryRestController {

    @Autowired
    private CategoryService myCategoryService;

    @GetMapping
    public List<Category> getAllCategory(){
        return myCategoryService.getAllCategory();
    }

    @PostMapping
    public Category createCategories(@RequestBody Category myCategory){
        return myCategoryService.createCategory(myCategory);
    }

    @PutMapping("/{id}")
    public Category updateCategories(@PathVariable Integer id, @RequestBody Category categoryUpdated){

        return myCategoryService.updateCategory(id, categoryUpdated);
    }
    @DeleteMapping("/{id}")
    public Category deleteCategory(@PathVariable Integer id){
        myCategoryService.deleteCategory(id);
        return null;
    }
}
