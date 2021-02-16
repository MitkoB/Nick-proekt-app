package com.example.nick.config;

import com.example.nick.service.CategoryService;
import com.example.nick.service.ExerciseService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    //public static List<Exercise> exerciseList=new ArrayList<>();
    private final ExerciseService exerciseService;
    private final CategoryService categoryService;

    public DataHolder(ExerciseService exerciseService, CategoryService categoryService) {
        this.exerciseService = exerciseService;
        this.categoryService = categoryService;
    }

    @PostConstruct
    public void init() {
        this.categoryService.create("Грб", "Специјално одбрани вежби кои се препорачуваат на лица со било какво" +
                        " искривување на 'рбетот, неправилно држење на телото или болка во било кој предел на грбот или половината.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuNm5_iWY5fuJFMEgMR2R1DSWQDjVrUnT31Q&usqp=CAU",
                "https://img.freepik.com/free-vector/man-with-gesture-low-back-pain_81698-1496.jpg?size=626&ext=jpg");
        this.categoryService.create("Нозе", "Вежбите за нозе се внимателно одбрани да помогнат на лица кои имаат проблеми како" +
                        " што се слабост во мускулите, неправилен развој во коските или пак привремен инвалидитет во нозете.",
                "https://igniterockford.files.wordpress.com/2010/11/legs.gif", "https://webstockreview.net/images/injury-clipart-knee-injury-5.jpg");
        this.categoryService.create("Раце", "Овие вежби се препорачуваат за лица кои имаат привремена парализа на рацете, болка во зглобовите " +
                        "или пак како помош при опоравување после некоја претрпена повреда во рацете.",
                "https://media.istockphoto.com/vectors/female-biceps-well-toned-elbowbent-arm-showing-progress-after-fitness-vector-id935265008?b=1&k=6&m=935265008&s=612x612&w=0&h=c5eZ3nwKtxMurhErY5E2xnU13KrDEwh2DL7WbeRhvG4=",
                "https://image.freepik.com/free-vector/vector-illustration-tiny-cute-cartoon-patient-man-character-broken-right-arm-gypsum-bandage-plastered-arm_52005-73.jpg");
        this.categoryService.create("Зглобови", "Вежби за помош на лица со воспаление на зглобовите, " +
                        "артитис, болка, вкочанетост или огранично движење во зглобовите на вратот, рамењата, коленото, лактите, дланките и стапалата.",
                "https://st2.depositphotos.com/5534582/9365/v/600/depositphotos_93653588-stock-illustration-traumatology-and-pain.jpg",
                "https://cdn-b.medlife.com/2018/01/healthy-joints-3.png");
        this.categoryService.create("Истегнување", "Во оваа група на вежби се наоѓаат вежбите кои се препорачуваат за сите" +
                        " лица без разлика на попреченоста. Овие вежби помагаат во правилен развој и држење на телото како и за релаксација",
                "https://thumbs.dreamstime.com/b/fitness-sport-exercise-lifestyle-cartoon-black-white-woman-doing-stretching-workout-gym-yoga-training-vector-154542637.jpg",
                "https://www.pngitem.com/pimgs/m/193-1930915_transparent-yoga-pose-png-yoga-kids-png-png.png");

        this.exerciseService.create("Екстензија на зглоб","За да ја направете оваа вежба следете ги следните чекори:\n" +
                "1. Застанете исправено со исправени нозе раширени во ширина на рамото.\n" +
                        " 2. Испружете ги рацете напред и држете се за стол или маса.\n "+
                "3. Држејќи ја десната нога исправена, подигајте ја левата нога назад без да го свиткате коленото.\n " +
                        "4. Подигнете ја колку што можете без да предизвикате" +
                "непријатност, а потоа цврсто затегнете го задникот и држете ја оваа позиција 5 секунди. ПОВТОРЕТЕ го ова истегнување 5-10 пати на секоја нога.",4L,"https://cdn-prod.medicalnewstoday.com/content/images/articles/325/325029/hip-extension-gif.gif",
                "https://cdn-prod.medicalnewstoday.com/content/images/articles/325/325029/hip-extension-gif.gif","5-10 пати");
        this.exerciseService.create("Двојна ротација на колк","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Легнете рамно на грбот.\n" +
                        " 2. Потоа, свиткајте ги колената и доведете ги кон телото додека стапалата не бидат рамни на подот.\n" +
                        "3.Нежно завртете ги колената налево, спуштајќи ги кон подот.\n " +
                        "4. Свртете ја главата кон лицето надесно, додека држите ги рамената кон подот." +
                         "Држете ја оваа позиција 20-30 секунди.\n" +
                        "5. Полека вратете ги и главата и колената во почетната позиција.\n" +
                         "Повторете го на спротивната страна.",4L,
                "https://thumbs.gfycat.com/WhiteWeepyGermanspitz-small.gif","https://thumbs.gfycat.com/WhiteWeepyGermanspitz-small.gif","1-5 пати");

    }
}
