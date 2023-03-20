package com.atguigu.service;

import com.atguigu.domain.Architect;
import com.atguigu.domain.Designer;
import com.atguigu.domain.Employee;
import com.atguigu.domain.Programmer;

/**
 * @author yian
 * @date 2023/3/20 14:21
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;//记录开发人数

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满,无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是程序员");
        }
        boolean isExist = isExist(e);
        if (isExist) {
            throw new TeamException("该成员已在该团队中");
        }
        switch (((Programmer) e).getStatus()) {
            case BUSY:
                throw new TeamException("该成员已经有团队了");
            case VOCATION:
                throw new TeamException("该成员正在休假");
        }
        int progNum, desNum, arcNum = 0;
        progNum = desNum = arcNum;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                progNum++;
            }
        }
        if (e instanceof Architect ) {
            if (arcNum >= 1){
                throw new TeamException("团队最多一个架构师");
            }
        } else if (e instanceof Designer) {
            if (desNum >= 2) {
                throw new TeamException("团队最多两个设计师");
            }
        }else if ((progNum >= 3)){
            throw new TeamException("团队最多三个程序员");
        }
        team[total++]=(Programmer)e;
        if (((Programmer) e).getMember()==0){
            ((Programmer) e).setMember(counter++);
        }
        ((Programmer) e).setStatus(Status.BUSY);

        //代码如果可以运行到这里.代表可以添加到团队里
    }

    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    public void remove(int memberId) throws TeamException{
        for (int i = 0; i < total; i++) {
            if (team[i].getMember()==memberId){
                //找到员工了
                team[i].setStatus(Status.FREE);
                for (int j = 0; j < i - 1; j++) {
                    team[j]=team[j+1];
                }
                team[--total]=null;
                return;
            }
        }
        throw new TeamException("没找到指定Id的员工");
    }
}
