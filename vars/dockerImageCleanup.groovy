def call(String project, String ImageTag, String hubUser){
    
     sh """
      docker images
      docker rmi ${hubUser}/${project}:${ImageTag}
    
     """
}


//def call(String aws_account_id, String region, String ecr_repoName){
    //  docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
  //  sh """
    // docker rmi ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    //"""
//}
