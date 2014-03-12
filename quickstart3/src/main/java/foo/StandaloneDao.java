package foo;



import java.util.List;

public interface StandaloneDao {
   
	
	public List findAll();

    void save(StandaloneVO standaloneVO);
}
