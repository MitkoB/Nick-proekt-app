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
        this.exerciseService.create("Детска позиција","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Со рацете и колената на земја, спуштајте се надолу.\n" +
                        "2. Потпрете го стомакот на бутовите.\n" +
                        "3. Проширете ги рацете пред или заедно со телото со дланките свртени нагоре.\n" +
                        "4. Фокусирајте се на длабоко дишење и опуштање на сите области на напнатост или затегнатост.\n" +
                         "Држете ја оваа позиција до 1 минута.",1L,
                "https://thumbs.gfycat.com/AdolescentIlliterateKoodoo-max-1mb.gif","https://thumbs.gfycat.com/AdolescentIlliterateKoodoo-max-1mb.gif","1-5 пати");
        this.exerciseService.create("Cat-cow","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Поставете се во позиција на маса, и раце и нозе на земја.\n" +
                        "2. Притиснете со рацете и нозете додека вдишувате за да погледнете нагоре, дозволувајќи му на вашиот стомак да се наполни со воздух.\n" +
                        "3. Издишете, вметнете ја брадата во градите и заоблете го 'рбетот кон таванот.\n" +
                        "Правете 1/2 минути.",1L,
                "https://177d01fbswx3jjl1t20gdr8j-wpengine.netdna-ssl.com/wp-content/uploads/2019/06/Cat-Cow.gif","https://177d01fbswx3jjl1t20gdr8j-wpengine.netdna-ssl.com/wp-content/uploads/2019/06/Cat-Cow.gif","1-5 пати");

        this.exerciseService.create("Military press","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Со дланките свртени напред, држете тегови над секое рамо, приближно во висина на брадата.\n" +
                        "2. Теговите дигајте ги над глава.\n" +
                        "3. Држете ги неколку секунди и спуштете ги повторно во почетна позиција.\n"
                        ,3L,
                "https://post.healthline.com/wp-content/uploads/2020/05/400x400_Try_This_5_Free_Weight_Exercises_to_Consider_and_Why_You_Should_Overhead_Shoulder_Press.gif","https://post.healthline.com/wp-content/uploads/2020/05/400x400_Try_This_5_Free_Weight_Exercises_to_Consider_and_Why_You_Should_Overhead_Shoulder_Press.gif","15 пати");
        this.exerciseService.create("Lateral raise","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Застанете или седете со рацете настрана и со тег во секоја рака.\n" +
                        "2. Со дланките свртени кон телото и лаковите малку свиткани, подигнете ги тегови, така што рацете ќе бидат паралелни со подот. Треба да направите Т-форма.\n" +
                        "3. Полека спуштете ги тегови до почетната позиција.\n"
                ,3L,
                "http://www.lifetime60day.com/wp-content/uploads/2017/12/Lateral-Raise.gif","http://www.lifetime60day.com/wp-content/uploads/2017/12/Lateral-Raise.gif","15 пати");
        this.exerciseService.create("Quad stretch","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Застанете со вашата страна кон ѕидот, ставајќи рака на ѕидот за рамнотежа.\n" +
                        "2. Држете ја надворешната нога со надворешната рака и подигнете ја ногата нагоре кон задниот крај, држејќи ги бутовите и колената заедно.\n" +
                        "3. Држете за циклус на релаксирано дишење, а потоа сторете го истото за другата нога.\n"
                       ,2L,
                "https://thumbs.gfycat.com/DeliriousFearfulIslandcanary-small.gif","https://thumbs.gfycat.com/DeliriousFearfulIslandcanary-small.gif","10 пати на секоја нога");
        this.exerciseService.create("Inner thigh stretch","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Застанете со многу широк став. \n" +
                        "2. Свиткајте го десното колено додека го менувате целото тело десно додека не почувствувате истегнување на левата внатрешна нога.\n" +
                        "3. Издишете, вметнете ја брадата во градите и заоблете го 'рбетот кон таванот.\n" +
                        "Правете 1/2 минути.",2L,
                "https://thumbs.gfycat.com/DeterminedConcernedAmurstarfish-small.gif","https://thumbs.gfycat.com/DeterminedConcernedAmurstarfish-small.gif","10 пати на секоја нога");

        this.exerciseService.create("Cobra stretch","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Легнете на стомак и ставете ги рацете рамно под рамената.\n" +
                        "2. Свиткајте ги лактите за вашите страни и нежно подигнете ја главата и градите, држејќи ги колковите и препоните на креветот.\n" +
                        "3. Не заборавајте да ги опуштите вратот и рамената. Држете го истегнувањето 15-20 секунди и кога сте подготвени, нежно спуштете се надолу.\n"
                        ,5L,
                "https://images.squarespace-cdn.com/content/v1/5b900adb4cde7a0e7998e50c/1579210508938-IQJOJHAPLJ59KGPKDFKS/ke17ZwdGBToddI8pDm48kLPswmMOqQZ9-Q6KHLjvbpZ7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UVTQf06wQztZgT3ocQ_Nttc9pRe5bgfSgFgLIpbw9lM5m7cT0R_dexc_UL_zbpz6JQ/Cobra-top-title.gif","https://images.squarespace-cdn.com/content/v1/5b900adb4cde7a0e7998e50c/1579210508938-IQJOJHAPLJ59KGPKDFKS/ke17ZwdGBToddI8pDm48kLPswmMOqQZ9-Q6KHLjvbpZ7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UVTQf06wQztZgT3ocQ_Nttc9pRe5bgfSgFgLIpbw9lM5m7cT0R_dexc_UL_zbpz6JQ/Cobra-top-title.gif","2 пати");
        this.exerciseService.create(" Spinal twist","За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Лежејќи на грб, подигнете го едното колено и нежно превртете го на спротивната страна. Осигурете се дека и двете рамена остануваат во контакт со подлогата постојано..\n" +
                        "2. Треба да го почувствувате истегнувањето на страните на горниот дел од телото и долниот дел на грбот.\n" +
                        "3. Дишете длабоко и повторете го на спротивната страна.\n"
                       ,5L,
                "https://www.verywellfit.com/thmb/3TEbXpzrpMJwy0A4RlhA3zQCQ04=/1500x844/smart/filters:no_upscale()/Verywell-20-4023748-SpinalTwist01-1729-5995b536845b340010c016cf.gif","https://www.verywellfit.com/thmb/3TEbXpzrpMJwy0A4RlhA3zQCQ04=/1500x844/smart/filters:no_upscale()/Verywell-20-4023748-SpinalTwist01-1729-5995b536845b340010c016cf.gif","по 30 секунди на секоја страна");

    }
}
