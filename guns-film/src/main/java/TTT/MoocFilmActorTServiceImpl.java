package TTT;

import com.stylefeng.guns.rest.persistence.model.MoocFilmActorT;
import com.stylefeng.guns.rest.persistence.dao.MoocFilmActorTMapper;
import TTT.IMoocFilmActorTService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 影片与演员映射表 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2021-01-02
 */
@Service
public class MoocFilmActorTServiceImpl extends ServiceImpl<MoocFilmActorTMapper, MoocFilmActorT> implements IMoocFilmActorTService {

}
