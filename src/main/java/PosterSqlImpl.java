import java.util.List;

public class PosterSqlImpl implements CustomerRepository {

    @Override
    public List<String> findNames() {
        return List.of("pedro", "luiz");
    }
}