﻿using UnityEngine;
using UnityEngine.SceneManagement;
using System.Collections;
using System;

public class Player_Movement : MonoBehaviour {

    private Rigidbody rb;
    private bool grounded = false;
    private float moveHoriOffset;
    private float moveVertOffset;
    private string currentLevel;

    public int deathPlane;

    public float forceMultiplier;
    public float jumpPower;
    public LayerMask terrain;    
    public float groundCheckRadius; //Storleken på sfären som kollar om bollen är på marken, bollen i sig har en radius på 0.25 [scale 0.5]
    public float jumpSensitivity;
    public bool isCube = false;
    public bool airControll = false;

    [HideInInspector] public float moveHori;
    [HideInInspector] public float moveVert;
    [HideInInspector] public float moveUp;

	// Use this for initialization
	void Start ()
    {
        rb = GetComponent<Rigidbody>();
        moveHoriOffset = Input.acceleration.x;  //  Kollar lutning när spelet börjar
        moveVertOffset = Input.acceleration.y;

        currentLevel = SceneManager.GetActiveScene().name;
    }

    void FixedUpdate()
    {
        moveHori = (float) Math.Round(Input.acceleration.x - moveHoriOffset, 1);    //Avrunda input till en decimal
        moveVert = (float) Math.Round(Input.acceleration.y - moveVertOffset, 1);
        moveUp = 0;

        if (!isCube) grounded = Physics.CheckSphere(new Vector3(transform.position.x, transform.position.y, transform.position.z), groundCheckRadius, terrain); //kollar om bollen/kuben är på marken eller inte genom att 
        else grounded = Physics.CheckBox(new Vector3(transform.position.x, transform.position.y, transform.position.z), new Vector3(0.51f, 0.51f, 0.51f), Quaternion.identity, terrain); // rita en sfär/låda runt och se om den rör vid specifikt
                                                                                                                                                                                         //layer. All mark har terrain som layer

        //Debug.DrawLine(transform.position, new Vector3(transform.position.x, transform.position.y - groundCheckRadius, transform.position.z));    
        if (grounded && Input.acceleration.z > jumpSensitivity)  //Om bollen är på marken och tillräcklig z-fart, hoppa
        {
            moveUp = 1;
        }

        if (!grounded && !airControll) //Är i luften och har ingen luft-kontroll
        {
            moveHori = 0;
            moveVert = 0;
        }

        Vector3 movement = new Vector3(moveHori, moveUp * jumpPower, moveVert);
        rb.AddForce(movement * forceMultiplier * 2); //Knuffa bollen efter att ha multiplicerat kraften
    }

    void LateUpdate()
    {
        //Debug.Log(grounded);
    }
	
	// Update is called once per frame
	void Update ()
    {
        if (transform.position.y < deathPlane) //starta om om bollen kommer för långt ner
        {
            SceneManager.LoadScene(currentLevel);
        }
	}
//<<<<<<< HEAD

//=======
//>>>>>>> origin/master
}
