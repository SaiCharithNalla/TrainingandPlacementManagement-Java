package Review2;

import java.util.Objects;
import javax.management.InvalidAttributeValueException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    ArrayList<Admin> admin = new ArrayList<Admin>();
    ArrayList<Donator> donor = new ArrayList<Donator>();
    ArrayList<Needy_people> needy_people = new ArrayList<Needy_people>();
    ArrayList<Employee> emp = new ArrayList<Employee>();
    ArrayList<Block_user> blocked_user = new ArrayList<Block_user>();
    ArrayList<medicine_don> Med_don = new ArrayList<medicine_don>();
    ArrayList<medicine_req> Med_req = new ArrayList<medicine_req>();

    Scanner scan = new Scanner(System.in);
    String choice = new String();
    int ch;
    String loginID = new String();
    int index = 0;
    do {
      while (true) {
        System.out.println("\nMENU\nEnter any one of the following options:\nPress 1 - Sign In\nPress 2 - Create Account\n");
        try {
          ch = scan.nextInt();
          if (ch != 1 && ch != 2) {
            throw new InvalidAttributeValueException();
          } else {
            break;
          }
        } catch (InvalidAttributeValueException e) {
          System.out.println("Not a Valid Value.");
        }
      }

      if (ch == 2) {
        while (true) {
          System.out.println("\nMENU\nEnter any one of the following options:\nPress 1 - Employee\nPress 2 - Donator\nPress 3 - Requestor\n");
          try {
            ch = scan.nextInt();
            if (ch != 999 && ch != 1 && ch != 2 && ch != 3) {
              throw new InvalidAttributeValueException();
            } else {
              break;
            }
          } catch (InvalidAttributeValueException e) {
            System.out.println("Not a Valid Value.");
          }
        }
        if (ch == 999) {
          admin.add(new Admin());
          String id = "A" + Admin.getCount();
          admin.get(Admin.getCount() - 1).setId(id);
          System.out.println("Enter Name: ");
          scan.nextLine();
          admin.get(Admin.getCount() - 1).setU_name(scan.nextLine());
          System.out.println("Enter Password: ");
          while (true) {
            String regPass =
                "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            try {
              String password = scan.nextLine();
              boolean check = password.matches(regPass);
              if (check) {
                admin.get(Admin.getCount() - 1).setPassword(password);
                break;
              } else {
                throw new Exception("Enter Valid Password");
              }
            } catch (Exception Password) {
              System.out.println(Password.getMessage());
            }
          }
          System.out.println("Enter Phone Number: ");
          while (true) {
            String regNumb = "^[6-9]\\d{9}$";
            try {
              String numb = scan.nextLine();
              boolean check = numb.matches(regNumb);
              if (check) {
                admin.get(Admin.getCount() - 1).setU_phone(numb);
                break;
              } else {
                throw new Exception("Enter Valid Phone Number");
              }
            } catch (Exception Number) {
              System.out.println(Number.getMessage());
            }
          }

          System.out.println("Enter Address: ");
          admin.get(Admin.getCount() - 1).u_address.setAddressDetails();
          admin.get(Admin.getCount() - 1).displayDetails();
        } else if (ch == 2) {
          donor.add(new Donator());
          String id = "D" + Donator.getCount();
          donor.get(Donator.getCount() - 1).setId(id);
          System.out.println("Enter Name: ");
          scan.nextLine();
          donor.get(Donator.getCount() - 1).setU_name(scan.nextLine());
          System.out.println("Enter Password: ");
          while (true) {
            String regPass =
                "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            try {
              String password = scan.nextLine();
              boolean check = password.matches(regPass);
              if (check) {
                donor.get(Donator.getCount() - 1).setPassword(password);
                break;
              } else {
                throw new Exception("Enter Valid Password");
              }
            } catch (Exception Password) {
              System.out.println(Password.getMessage());
            }
          }
          System.out.println("Enter Phone Number: ");
          while (true) {
            String regNumb = "^[6-9]\\d{9}$";
            try {
              String numb = scan.nextLine();
              boolean check = numb.matches(regNumb);
              if (check) {
                donor.get(Donator.getCount() - 1).setU_phone(numb);
                break;
              } else {
                throw new Exception("Enter Valid Phone Number");
              }
            } catch (Exception Number) {
              System.out.println(Number.getMessage());
            }
          }

          System.out.println("Enter Address: ");
          donor.get(Donator.getCount() - 1).u_address.setAddressDetails();

          System.out.println("Enter Aadhaar Number: ");
          while (true) {
            String regNumb = "^[2-9][0-9]{11}$";
            try {
              String numb = scan.nextLine();
              boolean check = numb.matches(regNumb);
              if (check) {
                donor.get(Donator.getCount() - 1).setU_aadhar_No(numb);
                break;
              } else {
                throw new Exception("Enter Valid Aadhaar Number");
              }
            } catch (Exception Number) {
              System.out.println(Number.getMessage());
            }
          }
          donor.get(Donator.getCount() - 1).displayDetails();
        } else if (ch == 3) {
          needy_people.add(new Needy_people());
          String id = "N" + Needy_people.getCount();
          needy_people.get(Needy_people.getCount() - 1).setId(id);
          System.out.println("Enter Name: ");
          scan.nextLine();
          needy_people.get(Needy_people.getCount() - 1).setU_name(scan.nextLine());
          System.out.println("Enter Password: ");
          while (true) {
            String regPass =
                "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            try {
              String password = scan.nextLine();
              boolean check = password.matches(regPass);
              if (check) {
                needy_people.get(Needy_people.getCount() - 1).setPassword(password);
                break;
              } else {
                throw new Exception("Enter Valid Password");
              }
            } catch (Exception Password) {
              System.out.println(Password.getMessage());
            }
          }
          System.out.println("Enter Phone Number: ");
          while (true) {
            String regNumb = "^[6-9]\\d{9}$";
            try {
              String numb = scan.nextLine();
              boolean check = numb.matches(regNumb);
              if (check) {
                needy_people.get(Needy_people.getCount() - 1).setU_phone(numb);
                break;
              } else {
                throw new Exception("Enter Valid Phone Number");
              }
            } catch (Exception Number) {
              System.out.println(Number.getMessage());
            }
          }

          System.out.println("Enter Address: ");
          needy_people.get(Needy_people.getCount() - 1).u_address.setAddressDetails();

          System.out.println("Enter Aadhaar Number: ");
          while (true) {
            String regNumb = "^[2-9][0-9]{11}$";
            try {
              String numb = scan.nextLine();
              boolean check = numb.matches(regNumb);
              if (check) {
                needy_people.get(Needy_people.getCount() - 1).setU_aadhar_No(numb);
                break;
              } else {
                throw new Exception("Enter Valid Aadhaar Number");
              }
            } catch (Exception Number) {
              System.out.println(Number.getMessage());
            }
          }
          needy_people.get(Needy_people.getCount() - 1).displayDetails();

        } else if (ch == 1) {
          emp.add(new Employee());
          String id = "E" + Employee.getCount();
          emp.get(Employee.getCount() - 1).setId(id);
          System.out.println("Enter Name: ");
          scan.nextLine();
          emp.get(Employee.getCount() - 1).setU_name(scan.nextLine());
          System.out.println("Enter Password: ");
          while (true) {
            String regPass =
                "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            try {
              String password = scan.nextLine();
              boolean check = password.matches(regPass);
              if (check) {
                emp.get(Employee.getCount() - 1).setPassword(password);
                break;
              } else {
                throw new Exception("Enter Valid Password");
              }
            } catch (Exception Password) {
              System.out.println(Password.getMessage());
            }
          }
          System.out.println("Enter Phone Number: ");
          while (true) {
            String regNumb = "^[6-9]\\d{9}$";
            try {
              String numb = scan.nextLine();
              boolean check = numb.matches(regNumb);
              if (check) {
                emp.get(Employee.getCount() - 1).setU_phone(numb);
                break;
              } else {
                throw new Exception("Enter Valid Phone Number");
              }
            } catch (Exception Number) {
              System.out.println(Number.getMessage());
            }
          }

          System.out.println("Enter Address: ");
          emp.get(Employee.getCount() - 1).u_address.setAddressDetails();

          System.out.println("Enter NGO Registration Number: ");
          emp.get(Employee.getCount() - 1).setId(scan.nextLine());
          emp.get(Employee.getCount() - 1).displayDetails();

        }
      } else if (ch == 1) {
        while (true) {
          System.out.println("\nMENU\nEnter:\n1 - Donor\n2 - Requestor\n3 - NGO\n");
          try {
            ch = scan.nextInt();
            if (ch != 999 && ch != 1 && ch != 2 && ch != 3) {
              throw new InvalidAttributeValueException();
            } else {
              break;
            }
          } catch (InvalidAttributeValueException e) {
            System.out.println("Not a Valid Value.");
          }
        }

        if (ch == 999) {
          while (true) {

            System.out.println("Enter Admin ID: ");
            scan.nextLine();
            String id = new String(scan.nextLine());

            for (Admin value : admin) {
              if (id.equals(value.getId())) {
                System.out.println("Enter Password: ");
                String password = new String(scan.next());
                if (Objects.equals(value.getPassword(), password)) {
                  System.out.println("Login Successful");
                  loginID = id;
                  while (true) {
                    System.out.println(
                        "\nMENU\nEnter:\n1 - Block a User\n2 - Sanction a Request\n3 - Sanction a Donation\n4 - Deliver Requests\n5 - Donations List\n6 - Display Number of Users\n7 - Change Password\n8 - Display Details\n9 - Exit");
                    int chc = scan.nextInt();
                    scan.nextLine();
                    if (chc == 1) {
                      System.out.println(
                          "\nList of Donors to be blocked_user");
                      for (medicine_don medicine : Med_don) {
                        if (medicine.getSanction() == 0) {
                          System.out.println(
                              medicine.getDonorId());
                        }
                      }
                      System.out.println("Enter the Donor ID to be blocked_user: ");
                      String block = new String(scan.nextLine());
                      for (Donator item : donor) {
                        if (Objects.equals(item.getId(), block)) {
                          item.setBlocked();
                          System.out.println("Donor ID " + block + " is blocked_user.");
                          System.out.println(
                              "Enter reason for block(Improper condition/ Expired): ");
                          String reason = new String(scan.nextLine());
                          LocalDate now = LocalDate.now();
                          Date date = java.sql.Date.valueOf(now);
                          blocked_user.add(new Block_user(id, reason, date));
                          block = "-1";
                          break;
                        }
                      }
                      if (!block.equals("-1")) {
                        System.out.println("Invalid Donor ID Entered.");
                      }

                    } else if (chc == 2) {
                      System.out.println("\nList of Requests to be approved: ");
                      for (medicine_req medicine : Med_req) {
                        if (medicine.getSanction() == -1) {
                          System.out.println(medicine.getReqMed());
                        }
                      }
                      System.out.println("Enter the Request ID to be Sanctioned: ");
                      String reqId = new String(scan.nextLine());
                      for (medicine_req medicine : Med_req) {
                        if (Objects.equals(medicine.getRequestId(), reqId)) {
                          medicine.setSanction();
                          reqId = "-1";
                          break;
                        }
                      }
                      if (!reqId.equals("-1")) {
                        System.out.println(
                            "Invalid Request ID Entered.");
                      }

                    } else if (chc == 3) {
                      System.out.println(
                          "\nList of Donations to be approved: ");
                      for (medicine_don medicine : Med_don) {
                        if (medicine.getSanction() == -1) {
                          System.out.println(medicine.getDonMed());
                        }
                      }
                      System.out.println("Enter the Donation ID to be Sanctioned: ");
                      String donId = new String(scan.nextLine());
                      for (medicine_don medicine : Med_don) {
                        if (Objects.equals(medicine.getDonorId(), donId)) {
                          medicine.setSanction();
                          donId = "-1";
                          break;
                        }
                      }
                      if (!donId.equals("-1")) {
                        System.out.println(
                            "Invalid Donation ID Entered.");
                      }
                    } else if (chc == 4) {
                      System.out.println("\nList of Requests to be delivered: ");
                      for (medicine_req medicine : Med_req) {
                        if (medicine.getDelivered() == 0) {
                          System.out.println(medicine.getReqMed());
                        }
                      }
                      System.out.println("Enter the Request ID to be delivered: ");
                      String delReq = new String(scan.next());
                      for (medicine_req medicine : Med_req) {
                        if (medicine.getRequestId().equals(delReq)) {
                          medicine.setDelivered();
                          System.out.println("The Request " + delReq + " is Delivered.");
                          for (Needy_people req : needy_people) {
                            if (req.getId().equals(medicine.getReqId())) {
                              req.setActive_req(req.getActive_req() - 1);
                            }
                            break;
                          }
                          break;
                        }
                      }
                    } else if (chc == 5) {
                      System.out.println("\nList of Donations: ");
                      for (medicine_don medicine : Med_don) {
                        System.out.println(medicine.getDonMed());
                      }
                    } else if (chc == 6) {
                      System.out.println("Number of Requestors:    " + Needy_people.getCount());
                      System.out.println("Number of Donors:        " + Donator.getCount());
                      System.out.println(
                          "Number of Requests:      " + (medicine_req.getCount() / 4));
                      System.out.println(
                          "Number of Donations:     " + (medicine_don.getCount() / 4));
                      System.out.println("Number of Blocked Users: " + Block_user.getCount());
                      System.out.println("Number of Admins:        " + Admin.getCount());
                    } else if (chc == 7) {
                      System.out.println("Enter old Password: ");
                      String oldPass = new String(scan.nextLine());
                      if (oldPass.equals(password)) {
                        value.resetPassword();
                      }
                    } else if (chc == 8) {
                      System.out.println("Admin Details:");
                      value.displayDetails();
                    } else if (chc == 9) {
                      System.out.println("Logging out of Admin");
                      break;
                    } else {
                      System.out.println("Not a Valid Choice");
                    }
                  }


                } else {
                  System.out.println("Incorrect Password");
                }
              }
            }
            if (!loginID.equals(id)) {
              System.out.println("Invalid Admin ID");
            }
            break;

          }

        } else if (ch == 1) {
          while (true) {
            System.out.println("Enter Donor ID: ");
            scan.nextLine();
            String id = new String(scan.nextLine());

            for (Donator value : donor) {
              if (id.equals(value.getId())) {
                System.out.println("Enter Password: ");
                String password = new String(scan.next());
                if (Objects.equals(value.getPassword(), password)) {
                  System.out.println("Login Successful");
                  loginID = id;
                  while (true) {

                    System.out.println(
                        "\nMENU:\nEnter:\n1 - Donate Medicine\n2 - View Donation Status\n3 - Change Password\n4 - Display Details\n5 - Exit");
                    int chc = scan.nextInt();
                    scan.nextLine();
                    if (chc == 1) {
                      System.out.println("\nDonated Medicine");
                      System.out.println("\nEnter Medicine Name: ");
                      String medName = new String(scan.nextLine());
                      System.out.println("\nEnter Medicine type:");
                      String medType = new String(scan.nextLine());
                      System.out.println("\nEnter the Quantity Donated:");
                      int medQuantity = scan.nextInt();
                      Med_don.add(new medicine_don());
                      value.don_med.add(new medicine_don());
                      Med_don.get((medicine_don.getCount() / 2) - 1)
                          .setMedicines(medName, medType, medQuantity);
                      System.out.println("Enter Expiry Date");
                      scan.nextLine();
                      String lastDate = scan.nextLine();
                      Med_don.get((medicine_don.getCount() / 2) - 1)
                          .setDonatedMedicine(("DONATION" + medicine_don.getCount() / 4), id,
                              lastDate);
                      value.don_med.set(value.don_med.size() - 1,
                          Med_don.get((medicine_don.getCount() / 2) - 1));
                      value.setnoDon(value.getnoDon() + 1);
                    } else if (chc == 2) {
                      System.out.println("Donation Status");
                      for (int j = 0; j < value.don_med.size(); j++) {
                        if (value.don_med.get(j).getSanction() == 1) {
                          System.out.println("The Donation Number " + j + " has been Verified");
                        } else if (value.don_med.get(j).getSanction() == 0) {
                          System.out.println("The Donation Number " + j + " has been Declined");
                        } else if (value.don_med.get(j).getSanction() == -1) {
                          System.out.println("The Donation Number " + j + " is yet to be Verified");
                        }
                      }
                    } else if (chc == 3) {
                      System.out.println("Enter old Password: ");
                      String oldPass = new String(scan.nextLine());
                      if (oldPass.equals(password)) {
                        value.resetPassword();
                      }
                    } else if (chc == 4) {
                      System.out.println("Donor Details: ");
                      value.displayDetails();
                    } else if (chc == 5) {
                      System.out.println("Logging out of Donator");
                      break;
                    } else {
                      System.out.println("Not a valid choice");
                    }
                  }
                } else {
                  System.out.println("Incorrect Password");
                }
              }
            }
            if (!loginID.equals(id)) {
              System.out.println("Invalid Donator ID");
            }
            break;
          }
        } else if (ch == 2) {
          while (true) {

            System.out.println("Enter Requestor ID: ");
            scan.nextLine();
            String id = new String(scan.nextLine());

            for (Needy_people value : needy_people) {
              if (id.equals(value.getId())) {
                System.out.println("Enter Password: ");
                String password = new String(scan.next());
                if (Objects.equals(value.getPassword(), password)) {
                  System.out.println("Login Successful");
                  loginID = id;
                  while (true) {
                    System.out.println(
                        "\nMENU\nEnter:\n1 - Request Medicine\n2 - View Request Status\n3 - Change Password\n4 - Display Details\n5 - Exit");
                    int chc = scan.nextInt();
                    scan.nextLine();
                    if (chc == 1) {
                      System.out.println("\nRequest Medicine");
                      System.out.println("\nEnter Medicine Name");
                      String medName = new String(scan.nextLine());
                      System.out.println("\nEnter Medicine type");
                      String medType = new String(scan.nextLine());
                      System.out.println("\nEnter needed quantity");
                      int medQuantity = scan.nextInt();
                      Med_req.add(new medicine_req());
                      value.req_med.add(new medicine_req());
                      Med_req.get((medicine_req.getCount() / 4) - 1)
                          .setMedicines(medName, medType, medQuantity);
                      System.out.println("Enter Needed Date");
                      scan.nextLine();
                      String lastDate = scan.nextLine();
                      Med_req.get((medicine_req.getCount() / 4) - 1)
                          .setReqMed(("REQUEST" + medicine_req.getCount() / 4), id, lastDate);
                      value.req_med.set(value.req_med.size() - 1,
                          Med_req.get((medicine_req.getCount() / 4) - 1));
                      value.setActive_req(value.getActive_req() + 1);
                      value.setnoReq(value.getnoReq() + 1);
                    } else if (chc == 2) {
                      System.out.println("Requests Status");
                      for (int j = 0; j < value.req_med.size(); j++) {
                        if (value.req_med.get(j).getSanction() == 1) {
                          System.out.println("The Request Number " + j + " has been Verified");
                        } else if (value.req_med.get(j).getSanction() == 0) {
                          System.out.println("The Request Number " + j + " has been Declined");
                        } else if (value.req_med.get(j).getSanction() == -1) {
                          System.out.println("The Request Number " + j + " is yet to be Verified");
                        }
                      }

                    } else if (chc == 3) {
                      System.out.println("Enter old Password: ");
                      String oldPass = new String(scan.nextLine());
                      if (oldPass.equals(password)) {
                        value.resetPassword();
                      }
                    } else if (chc == 4) {
                      System.out.println("Display Details");
                      value.displayDetails();
                    } else if (chc == 5) {
                      System.out.println("Logging out of Requestor");
                      break;
                    } else {
                      System.out.println("Not a Valid Choice");
                    }
                  }
                } else {
                  System.out.println("Incorrect Password");
                }
              }
            }
            if (!loginID.equals(id)) {
              System.out.println("Invalid Requestor ID");
            }
            break;
          }
        } else if (ch == 3) {
          while (true) {
            scan.nextLine();
            System.out.println("Enter NGO ID: ");
            String id = new String(scan.nextLine());

            for (Employee value : emp) {
              if (id.equals(value.getId())) {
                System.out.println("Enter Password: ");
                String password = new String(scan.next());
                if (Objects.equals(value.getPassword(), password)) {
                  System.out.println("Login Successful");
                  loginID = id;
                  while (true) {
                    System.out.println(
                        "\nMENU\nEnter:\n1 - Request Medicine\n2 - View Request Status\n3 - Donate Medicine\n4 - View Donation Status\n5 - Change Password\n6 - Display Details\n7 - Exit");
                    int chc = scan.nextInt();
                    scan.nextLine();
                    if (chc == 1) {
                      System.out.println("\nRequest Medicine");
                      System.out.println("\nEnter Medicine Name");
                      String medName = new String(scan.nextLine());
                      System.out.println("\nEnter Medicine type");
                      String medType = new String(scan.nextLine());
                      System.out.println("\nEnter needed quantity");
                      int medQuantity = scan.nextInt();
                      Med_req.add(new medicine_req());
                      value.req_med.add(new medicine_req());
                      Med_req.get((medicine_req.getCount() / 4) - 1)
                          .setMedicines(medName, medType, medQuantity);
                      System.out.println("Enter Needed Date");
                      scan.nextLine();
                      String lastDate = scan.nextLine();
                      Med_req.get((medicine_req.getCount() / 4) - 1)
                          .setReqMed(("REQUEST" + medicine_req.getCount() / 4), id, lastDate);
                      value.req_med.set(value.req_med.size() - 1,
                          Med_req.get((medicine_req.getCount() / 4) - 1));
                      value.setreq(value.getreq() + 1);

                    } else if (chc == 2) {
                      System.out.println("Requests Status");
                      for (int j = 0; j < value.req_med.size(); j++) {
                        if (value.req_med.get(j).getSanction() == 1) {
                          System.out.println("The Request Number " + j + " has been Verified");
                        } else if (value.req_med.get(j).getSanction() == 0) {
                          System.out.println("The Request Number " + j + " has been Declined");
                        } else if (value.req_med.get(j).getSanction() == -1) {
                          System.out.println("The Request Number " + j + " is yet to be Verified");
                        }
                      }

                    } else if (chc == 3) {
                      System.out.println("\nDonated Medicine");
                      System.out.println("\nEnter Medicine Name");
                      String medName = new String(scan.nextLine());
                      System.out.println("\nEnter Medicine type");
                      String medType = new String(scan.nextLine());
                      System.out.println("\nEnter the Quantity Donated:");
                      int medQuantity = scan.nextInt();
                      Med_don.add(new medicine_don());
                      value.don_med.add(new medicine_don());
                      Med_don.get((medicine_don.getCount() / 4) - 1)
                          .setMedicines(medName, medType, medQuantity);
                      System.out.println("Enter Expiry Date");
                      scan.nextLine();
                      String lastDate = scan.nextLine();
                      Med_don.get((medicine_don.getCount() / 4) - 1)
                          .setDonatedMedicine(("DONATION" + medicine_don.getCount() / 4), id,
                              lastDate);
                      value.don_med.set(value.don_med.size() - 1,
                          Med_don.get((medicine_don.getCount() / 4) - 1));
                      value.setdon(value.getdon() + 1);

                    } else if (chc == 4) {
                      System.out.println("Donation Status");
                      for (int j = 0; j < value.don_med.size(); j++) {
                        if (value.don_med.get(j).getSanction() == 1) {
                          System.out.println("The Donation Number " + j + " has been Verified");
                        } else if (value.don_med.get(j).getSanction() == 0) {
                          System.out.println("The Donation Number " + j + " has been Declined");
                        } else if (value.don_med.get(j).getSanction() == -1) {
                          System.out.println("The Donation Number " + j + " is yet to be Verified");
                        }
                      }
                    } else if (chc == 5) {
                      System.out.println("Enter old Password: ");
                      String oldPass = new String(scan.nextLine());
                      if (oldPass.equals(password)) {
                        value.resetPassword();
                      }
                    } else if (chc == 6) {
                      System.out.println("Display Details");
                      value.displayDetails();
                    } else if (chc == 7) {
                      System.out.println("Logging out of Employee");
                      break;
                    } else {
                      System.out.println("Not a Valid Choice");
                    }
                  }
                } else {
                  System.out.println("Incorrect Password");
                }
              }
            }
            if (!loginID.equals(id)) {
              System.out.println("Invalid Employee ID");
            }
            break;
          }
        }
      }
      System.out.println("Do you want to continue running this program?(yes/no): ");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("no")) {
        System.out.println("...End of the program...");
      }
    } while (!choice.toLowerCase().equals("no"));
  }
}
