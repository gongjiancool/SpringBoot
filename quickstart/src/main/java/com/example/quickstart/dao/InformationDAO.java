package com.example.quickstart.dao;

import com.example.quickstart.entity.Information;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 2018/9/10.
 */
@Configuration
@Data
public class InformationDAO {
    public List<Information> getInformation(){
        Information[] informations = {
                new Information("avatar.jpg","文刀漢三","09月01日",
                        "成为身边人中「懂设计」的那一个",
                        "如果你没有接触过设计，想要提高点儿设计感，懂得一些「性价比高」的设计常识。这套教程将会是一个很好的开始。",
                        "picture1.png",137,39),
                new Information("avatar1.jpg","Adventure","08月31日",
                        "iOS 12 用户遭遇系统「疯狂」弹窗，但目前并没有很好的解决方法",
                        "所有使用 iOS 12 测试版的用户今天都遇到恼人的「系统升级弹窗」问题，但目前并没有很好的解决办法。",
                        "picture2.jpg",31,63),
                new Information("avatar2.jpg","Vanilla","08月31日",
                        "发布会临近，换上这 38 张苹果 Logo 壁纸提前充值信仰",
                        "九月发布会邀请函火热出炉，已经有设计师将它做成了好看的壁纸。除此之外，还有很多历届苹果的发布会邀请函和各地 Apple Store 的宣传海报也被做成了各种天马行空的壁纸。一起来看看吧～",
                        "picture3.jpg",138,19),
                new Information("avatar3.jpg","i9NGbgNq","08月30日",
                        "画函数、写公式、导出 Markdown……这 7 个插件让 Google 文档更好用",
                        "本文将为大家介绍 7 个有关排版样式的 Google 文档插件，让你的文档变得美观好看。",
                        "picture4.jpg",83,7),
                new Information("avatar4.jpg","沨沄极客","08月30日",
                        "[送码] 以时间计划为核心，这款应用想要帮你更智能地管理任务：Sorted³",
                        "Sorted³ 是一款与时间高度结合的任务应用，今天发布的全新版本增加了自动计划、重新组织等有趣的新功能。有了它，我终于可以把其它任务管理工具全部删掉了。",
                        "picture5.jpg",94,265),
        };
        List<Information> informationList = Arrays.asList(informations);
        return informationList;
    }
}
