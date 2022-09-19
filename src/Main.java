public class Main {
    public static void main(String[] args) {
        var taskNum = 0;
        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("totalWeight = " + totalWeight);
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("differenceWeight = " + differenceWeight);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("differenceWeight 1 = " + differenceWeight);
        differenceWeight = boxer2Weight % boxer1Weight;
        System.out.println("differenceWeight 2 = " + differenceWeight);

        taskNum = taskNum + 1;
        System.out.println();
        System.out.println("task №" + taskNum);
        var totalHours = 640;
        var shift = 8;
        var totalEmployees = totalHours / shift;
        System.out.println("Всего работников в компании = " + totalEmployees + " человек.");
        totalEmployees += 94;
        totalHours = totalEmployees * shift;
        System.out.println("Если в компании работает " + totalEmployees + " человек(а), то всего " + totalHours);
        System.out.print(" часов работы может быть поделено между сотрудниками.");



    }
}