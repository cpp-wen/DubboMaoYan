package TTT;

import com.stylefeng.guns.rest.persistence.model.MoocFilmT;
import com.stylefeng.guns.rest.persistence.dao.MoocFilmTMapper;
import TTT.IMoocFilmTService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 影片主表 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2021-01-02
 */
@Service
public class MoocFilmTServiceImpl extends ServiceImpl<MoocFilmTMapper, MoocFilmT> implements IMoocFilmTService {

}
